(ns pinterest-rest-api.specs.bulk-download-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-entity-type :refer :all]
            [pinterest-rest-api.specs.bulk-download-request-campaign-filter :refer :all]
            [pinterest-rest-api.specs.bulk-output-format :refer :all]
            )
  (:import (java.io File)))


(def bulk-download-request-data
  {
   (ds/opt :entity_types) (s/coll-of bulk-entity-type-spec)
   (ds/opt :entity_ids) (s/coll-of string?)
   (ds/opt :updated_since) string?
   (ds/opt :campaign_filter) bulk-download-request-campaign-filter-spec
   (ds/opt :output_format) bulk-output-format-spec
   })

(def bulk-download-request-spec
  (ds/spec
    {:name ::bulk-download-request
     :spec bulk-download-request-data}))
