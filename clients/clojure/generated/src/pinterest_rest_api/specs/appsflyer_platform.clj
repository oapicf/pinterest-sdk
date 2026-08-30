(ns pinterest-rest-api.specs.appsflyer-platform
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def appsflyer-platform-data
  {
   })

(def appsflyer-platform-spec
  (ds/spec
    {:name ::appsflyer-platform
     :spec appsflyer-platform-data}))
