Test for string comparison

As a result I see an output when compare object links:

 matchSameNewStrings positive = 0, negative = 1000000
 
 matchSameString positive = 1000000, negative = 0
 
 matchSameLinks positive = 1000000, negative = 0
 
 
 Well. The next is cached:
 
      String str1 = "test";
      
      String str2 = "test";
      
But The next is not cached:

      String str1 = "test";
      
      String str2 = new String("test");
