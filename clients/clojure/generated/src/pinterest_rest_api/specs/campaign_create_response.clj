(ns pinterest-rest-api.specs.campaign-create-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-create-response-item :refer :all]
            )
  (:import (java.io File)))


(def campaign-create-response-data
  {
   (ds/opt :items) (s/coll-of campaign-create-response-item-spec)
   })

(def campaign-create-response-spec
  (ds/spec
    {:name ::campaign-create-response
     :spec campaign-create-response-data}))
