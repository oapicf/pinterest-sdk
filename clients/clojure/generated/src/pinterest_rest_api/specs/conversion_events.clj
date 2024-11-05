(ns pinterest-rest-api.specs.conversion-events
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-events-data-inner :refer :all]
            )
  (:import (java.io File)))


(def conversion-events-data
  {
   (ds/req :data) (s/coll-of conversion-events-data-inner-spec)
   })

(def conversion-events-spec
  (ds/spec
    {:name ::conversion-events
     :spec conversion-events-data}))
