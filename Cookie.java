class Cookie {
  int numCookies;
  int bakeTemp;
  int minutesBaked;
  boolean isReady;

  Cookie() {
    numCookies = 0;
    bakeTemp = 0;
    minutesBaked = 0;
    isReady = false;
  }

  Cookie(int aNumCookies, int aBakeTemp, int aMinutesBaked) {
    numCookies = aNumCookies;
    bakeTemp = aBakeTemp;
    minutesBaked = aMinutesBaked;
    isReady = false;
  }

  boolean getIsReady() {
    return isReady;
  }

  void setNumCookies(int aNumCookies) {
    numCookies = aNumCookies;
  }

  void bakeCookies(int aBakeTemp, int aBakeTime) {
    System.out.println(numCookies + " cookies were baked at " + aBakeTemp + " degrees F for " + aBakeTime + " minutes");
    isReady = true;
  }
}