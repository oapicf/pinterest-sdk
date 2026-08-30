(ns pinterest-rest-api.specs.conversion-events-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-events-data-items :refer :all]
            )
  (:import (java.io File)))


(def conversion-events-create-data
  {
   (ds/req :data) (s/coll-of conversion-events-data-items-spec)
   })

(def conversion-events-create-spec
  (ds/spec
    {:name ::conversion-events-create
     :spec conversion-events-create-data}))
