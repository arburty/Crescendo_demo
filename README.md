# Yelp Reviews Skills Assessment

This challenge allows you to show us your technical skills, how well you can
put together a project from scratch and what you think about as you create your
solution. Here is what we want you to do:

    Choose your favorite local restaurant on Yelp that has a considerable
    amount of reviews. Here is an example.
    https://click.pstmrk.it/2s/www.yelp.com%2Fbiz%2Fmilwaukee-ale-house-milwaukee/CLfociYN/h0sH/LaQbwh8u81

    Build an API endpoint in your preferred language and framework (e.g.,
    Spring Boot) that can take a parameter that you’ll use to retrieve the Yelp
    data.

    In the API endpoint, process the Yelp data, pull out the reviews, convert
    the review data into a list and output the information as JSON. Processing
    could be by Yelp API. Your JSON should include the reviewer’s relevant info
    and review content.

    Extra credit: For each review, take the reviewer avatar image and run it
    through the Google Vision API. What we are looking for is the emotions data
    such as joyLikelihood or sorrowLikelihood. Include this data along with the
    JSON data. If you are familiar with a similar technology feel free to use
    that instead of the Google Vision API.


## Available Endpoints
The availble endpoints are:

GET: '/yelp/reviews'
   param: restaurant defaultValue='casa-bonita-lakewood-2'
   desc: Return all the data from the 'api.yelp.com/v3/businesses/{id}/reviews' endpoint.
GET: '/yelp/justreviews'
   desc: A simple pretty print version that returns a list of strings.
   param: restaurant defaultValue='casa-bonita-lakewood-2'
GET: '/help'
   desc: an endpoint to tell you about the available endpoints.

## Running the Application
Run the application with: `./mvnw run spring-boot:run`
in the projects root directory and the endpoints can be found at localhost:8080
e.x. `curl localhost:8080/help`


