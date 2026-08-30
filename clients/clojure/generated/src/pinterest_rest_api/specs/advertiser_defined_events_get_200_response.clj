(ns pinterest-rest-api.specs.advertiser-defined-events-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advertiser-defined-event :refer :all]
            )
  (:import (java.io File)))


(def advertiser-defined-events-get-200-response-data
  {
   (ds/req :items) (s/coll-of advertiser-defined-event-spec)
   })

(def advertiser-defined-events-get-200-response-spec
  (ds/spec
    {:name ::advertiser-defined-events-get-200-response
     :spec advertiser-defined-events-get-200-response-data}))
