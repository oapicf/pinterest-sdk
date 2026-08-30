(ns pinterest-rest-api.specs.appsflyer-audience
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.appsflyer-platform :refer :all]
            )
  (:import (java.io File)))


(def appsflyer-audience-data
  {
   (ds/req :container_id) string?
   (ds/req :name) string?
   (ds/req :platform) appsflyer-platform-spec
   })

(def appsflyer-audience-spec
  (ds/spec
    {:name ::appsflyer-audience
     :spec appsflyer-audience-data}))
