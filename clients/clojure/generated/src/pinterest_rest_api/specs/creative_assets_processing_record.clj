(ns pinterest-rest-api.specs.creative-assets-processing-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            [pinterest-rest-api.specs.item-processing-status :refer :all]
            )
  (:import (java.io File)))


(def creative-assets-processing-record-data
  {
   (ds/opt :creative_assets_id) string?
   (ds/opt :errors) (s/coll-of item-validation-event-spec)
   (ds/opt :warnings) (s/coll-of item-validation-event-spec)
   (ds/opt :status) item-processing-status-spec
   })

(def creative-assets-processing-record-spec
  (ds/spec
    {:name ::creative-assets-processing-record
     :spec creative-assets-processing-record-data}))
