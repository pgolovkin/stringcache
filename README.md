Test for string comparison

I've decided to test when String is getting from string pool or not.

To find out it I've just used comparison using `==` operator.

As a result I see an output when compare object links:

 matchSameNewStrings positive = 0, negative = 1000000
 
 matchSameString positive = 1000000, negative = 0
 
 matchSameLinks positive = 1000000, negative = 0
 
 
 Well. The next are from pool:
 
      String str1 = "test";
      
      String str2 = "test";
      
      and
      
      String str1 = "val";
      
      String str2 = String.valueOf("val");
      
But The next are not from pool:

      String str1 = "test";
      
      String str2 = new String("test");

My JDK:

java -version

java version "1.8.0_144"

Java(TM) SE Runtime Environment (build 1.8.0_144-b01)

Java HotSpot(TM) 64-Bit Server VM (build 25.144-b01, mixed mode)

