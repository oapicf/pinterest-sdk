(ns pinterest-rest-api.specs.promotion-application-level
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def promotion-application-level-data
  {
   })

(def promotion-application-level-spec
  (ds/spec
    {:name ::promotion-application-level
     :spec promotion-application-level-data}))
