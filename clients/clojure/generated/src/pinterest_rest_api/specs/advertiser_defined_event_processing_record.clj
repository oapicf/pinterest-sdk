(ns pinterest-rest-api.specs.advertiser-defined-event-processing-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def advertiser-defined-event-processing-record-data
  {
   (ds/opt :exceptions) (s/coll-of string?)
   (ds/req :name) string?
   (ds/req :status) string?
   })

(def advertiser-defined-event-processing-record-spec
  (ds/spec
    {:name ::advertiser-defined-event-processing-record
     :spec advertiser-defined-event-processing-record-data}))
