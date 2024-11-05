(ns pinterest-rest-api.specs.objective-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def objective-type-data
  {
   })

(def objective-type-spec
  (ds/spec
    {:name ::objective-type
     :spec objective-type-data}))
