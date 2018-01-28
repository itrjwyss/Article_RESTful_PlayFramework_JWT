
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/Auth0/RESTfulPlayJWT/playjava/conf/routes
// @DATE:Wed Jan 03 01:59:11 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def jsonCatch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/catch")
    }
  
    // @LINE:7
    def plainText(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "plainText")
    }
  
    // @LINE:9
    def jsonObject(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/object")
    }
  
    // @LINE:11
    def jsonBadRequest(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/badRequest")
    }
  
    // @LINE:8
    def jsonMap(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "json/map")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:14
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
