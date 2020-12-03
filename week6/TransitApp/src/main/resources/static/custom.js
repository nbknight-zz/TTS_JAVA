var map;
function initMap() {

	var icon = 'https://maps.google.com/mapfiles/kml/shapes/'
		
    map = new google.maps.Map(document.getElementById('map'), {
        center: { lat: parseFloat(busLocations[0].LATITUDE), lng: parseFloat(busLocations[0].LONGITUDE) },
        zoom: 15,
        scrollwheel: false
    });
	
    for (i=0; i<busLocations.length; i++){
        var marker = new google.maps.Marker({
        	icon: icon + 'bus.png',
            position: { lat: parseFloat(busLocations[i].LATITUDE), lng: parseFloat(busLocations[i].LONGITUDE) },
            // clickable: true,
            title: "Click for more info",
            map: map,
        });
        map.addListener("center_changed", () => {
            // 5 seconds after the center of the map has changed, pan back to the
            // marker.
            window.setTimeout(() => {
                map.panTo(marker.getPosition());
            }, 7000);
        });
        marker.addListener("click", () => {
            map.setZoom(25);
            map.setCenter(marker.getPosition());
        });
    }
}