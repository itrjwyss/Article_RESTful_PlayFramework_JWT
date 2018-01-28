
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/Auth0/RESTfulPlayJWT/playjava/conf/routes
// @DATE:Wed Jan 03 01:59:11 CST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def jsonCatch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.jsonCatch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/catch"})
        }
      """
    )
  
    // @LINE:7
    def plainText: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.plainText",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "plainText"})
        }
      """
    )
  
    // @LINE:9
    def jsonObject: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.jsonObject",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/object"})
        }
      """
    )
  
    // @LINE:11
    def jsonBadRequest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.jsonBadRequest",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/badRequest"})
        }
      """
    )
  
    // @LINE:8
    def jsonMap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.jsonMap",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "json/map"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
