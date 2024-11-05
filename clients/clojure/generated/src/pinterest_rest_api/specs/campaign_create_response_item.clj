(ns pinterest-rest-api.specs.campaign-create-response-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-create-response-data :refer :all]
            [pinterest-rest-api.specs.exception :refer :all]
            )
  (:import (java.io File)))


(def campaign-create-response-item-data
  {
   (ds/opt :data) campaign-create-response-data-spec
   (ds/opt :exceptions) (s/coll-of exception-spec)
   })

(def campaign-create-response-item-spec
  (ds/spec
    {:name ::campaign-create-response-item
     :spec campaign-create-response-item-data}))
