
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/itrjwyss/Documents/Auth0/RESTfulPlayJWT/playjava/conf/routes
// @DATE:Wed Jan 03 01:59:11 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """plainText""", """controllers.HomeController.plainText"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/map""", """controllers.HomeController.jsonMap"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/object""", """controllers.HomeController.jsonObject"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/catch""", """controllers.HomeController.jsonCatch"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/badRequest""", """controllers.HomeController.jsonBadRequest"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HomeController_plainText1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("plainText")))
  )
  private[this] lazy val controllers_HomeController_plainText1_invoker = createInvoker(
    HomeController_0.plainText,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "plainText",
      Nil,
      "GET",
      this.prefix + """plainText""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_jsonMap2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/map")))
  )
  private[this] lazy val controllers_HomeController_jsonMap2_invoker = createInvoker(
    HomeController_0.jsonMap,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "jsonMap",
      Nil,
      "GET",
      this.prefix + """json/map""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_jsonObject3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/object")))
  )
  private[this] lazy val controllers_HomeController_jsonObject3_invoker = createInvoker(
    HomeController_0.jsonObject,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "jsonObject",
      Nil,
      "GET",
      this.prefix + """json/object""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_jsonCatch4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/catch")))
  )
  private[this] lazy val controllers_HomeController_jsonCatch4_invoker = createInvoker(
    HomeController_0.jsonCatch,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "jsonCatch",
      Nil,
      "GET",
      this.prefix + """json/catch""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_jsonBadRequest5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/badRequest")))
  )
  private[this] lazy val controllers_HomeController_jsonBadRequest5_invoker = createInvoker(
    HomeController_0.jsonBadRequest,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "jsonBadRequest",
      Nil,
      "GET",
      this.prefix + """json/badRequest""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:7
    case controllers_HomeController_plainText1_route(params@_) =>
      call { 
        controllers_HomeController_plainText1_invoker.call(HomeController_0.plainText)
      }
  
    // @LINE:8
    case controllers_HomeController_jsonMap2_route(params@_) =>
      call { 
        controllers_HomeController_jsonMap2_invoker.call(HomeController_0.jsonMap)
      }
  
    // @LINE:9
    case controllers_HomeController_jsonObject3_route(params@_) =>
      call { 
        controllers_HomeController_jsonObject3_invoker.call(HomeController_0.jsonObject)
      }
  
    // @LINE:10
    case controllers_HomeController_jsonCatch4_route(params@_) =>
      call { 
        controllers_HomeController_jsonCatch4_invoker.call(HomeController_0.jsonCatch)
      }
  
    // @LINE:11
    case controllers_HomeController_jsonBadRequest5_route(params@_) =>
      call { 
        controllers_HomeController_jsonBadRequest5_invoker.call(HomeController_0.jsonBadRequest)
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
