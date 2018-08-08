import objsets._

val newTweetSet = new NonEmpty(new Tweet("Alejandro","Hola Mundo",retweets = 5)
  ,new NonEmpty(new Tweet("Alejandro","Hola",retweets = 3)
    ,new Empty, new Empty), new NonEmpty(new Tweet("Alejandro","Hola mundo Alex",retweets = 10)
    ,new Empty, new Empty))

var resultTweet = newTweetSet.filterAcc(Tweet => Tweet.retweets >= 5, new Empty)

var newEmptyTweet = new Empty

resultTweet.foreach(Tweet => println("texto:"+Tweet.text))

var unionTweets = newTweetSet.union(new NonEmpty(new Tweet("Alejandro2222","xx",retweets = 40)
  ,new Empty, new Empty))

unionTweets.foreach(Tweet => println("Usuarios::"+Tweet.text))

GoogleVsApple.googleTweets