(ns pinterest-rest-api.specs.mobile-app-platform
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def mobile-app-platform-data
  {
   })

(def mobile-app-platform-spec
  (ds/spec
    {:name ::mobile-app-platform
     :spec mobile-app-platform-data}))
