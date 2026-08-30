(ns pinterest-rest-api.specs.advertiser-defined-events-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advertiser-defined-event-input :refer :all]
            )
  (:import (java.io File)))


(def advertiser-defined-events-create-request-data
  {
   (ds/req :items) (s/coll-of advertiser-defined-event-input-spec)
   })

(def advertiser-defined-events-create-request-spec
  (ds/spec
    {:name ::advertiser-defined-events-create-request
     :spec advertiser-defined-events-create-request-data}))
