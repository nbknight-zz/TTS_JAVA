from flask import Flask, render_template
import random

app = Flask(__name__)

# list of cat images
images = [ 
        "https://www.buzzfeed.com/philippjahner/lets-watch-it-again?utm_source=dynamic&utm_campaign=bfsharecopy&sub=0_11676381#11676381",
        "https://www.buzzfeed.com/philippjahner/lets-watch-it-again?utm_source=dynamic&utm_campaign=bfsharecopy&sub=0_11676382#11676382"
        ]

@app.route('/')
def index():
    url = random.choice(images)
    return render_template('index.html', url=url)

if __name__ == "__main__":
    app.run(host="0.0.0.0")
