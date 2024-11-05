(ns pinterest-rest-api.specs.campaigns-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-response :refer :all]
            )
  (:import (java.io File)))


(def campaigns-list-200-response-data
  {
   (ds/req :items) (s/coll-of campaign-response-spec)
   (ds/opt :bookmark) string?
   })

(def campaigns-list-200-response-spec
  (ds/spec
    {:name ::campaigns-list-200-response
     :spec campaigns-list-200-response-data}))
