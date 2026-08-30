(ns pinterest-rest-api.specs.delivery-estimate-objective-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def delivery-estimate-objective-type-data
  {
   })

(def delivery-estimate-objective-type-spec
  (ds/spec
    {:name ::delivery-estimate-objective-type
     :spec delivery-estimate-objective-type-data}))
