(ns pinterest-rest-api.specs.advertiser-defined-events-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advertiser-defined-event :refer :all]
            )
  (:import (java.io File)))


(def advertiser-defined-events-response-data
  {
   (ds/opt :items) (s/coll-of advertiser-defined-event-spec)
   })

(def advertiser-defined-events-response-spec
  (ds/spec
    {:name ::advertiser-defined-events-response
     :spec advertiser-defined-events-response-data}))
