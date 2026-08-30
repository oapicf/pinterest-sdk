(ns pinterest-rest-api.specs.campaign-objective-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-objective-type-data
  {
   })

(def campaign-objective-type-spec
  (ds/spec
    {:name ::campaign-objective-type
     :spec campaign-objective-type-data}))
