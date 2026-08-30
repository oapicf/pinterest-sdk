(ns pinterest-rest-api.specs.appsflyer-audience-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.appsflyer-platform :refer :all]
            )
  (:import (java.io File)))


(def appsflyer-audience-create-data
  {
   (ds/req :name) string?
   (ds/req :platform) appsflyer-platform-spec
   })

(def appsflyer-audience-create-spec
  (ds/spec
    {:name ::appsflyer-audience-create
     :spec appsflyer-audience-create-data}))
