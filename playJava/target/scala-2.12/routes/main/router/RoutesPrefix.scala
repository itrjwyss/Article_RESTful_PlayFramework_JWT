
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/Auth0/RESTfulPlayJWT/playjava/conf/routes
// @DATE:Wed Jan 03 01:59:11 CST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
