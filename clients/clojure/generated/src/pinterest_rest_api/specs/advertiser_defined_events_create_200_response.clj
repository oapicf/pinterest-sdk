(ns pinterest-rest-api.specs.advertiser-defined-events-create-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advertiser-defined-event-processing-record :refer :all]
            )
  (:import (java.io File)))


(def advertiser-defined-events-create-200-response-data
  {
   (ds/req :items) (s/coll-of advertiser-defined-event-processing-record-spec)
   })

(def advertiser-defined-events-create-200-response-spec
  (ds/spec
    {:name ::advertiser-defined-events-create-200-response
     :spec advertiser-defined-events-create-200-response-data}))
