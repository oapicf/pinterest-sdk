(ns pinterest-rest-api.specs.campaign-update-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-create-response-item :refer :all]
            )
  (:import (java.io File)))


(def campaign-update-response-data
  {
   (ds/opt :items) (s/coll-of campaign-create-response-item-spec)
   })

(def campaign-update-response-spec
  (ds/spec
    {:name ::campaign-update-response
     :spec campaign-update-response-data}))
