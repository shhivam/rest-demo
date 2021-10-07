(ns rest-demo.api
  (:require
  ;;  [clojure.pprint :as pp]
   [clojure.data.json :as json]
  ;;  [ring.middleware.json :refer [wrap-json-response]]
   [ring.util.response :refer [response]]
   ))

; Simple Body Page
(defn simple-body-page [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "Hello World"})

; request-example
; I am facing problem here. I am getting an error response:
; "Don't know how to write JSON of class org.httpkit.server.AsyncChannel"
(defn request-example [req] {:status  200
                             :headers {"Content-Type" "text/json"}
                             :body    (str (json/write-str req))})