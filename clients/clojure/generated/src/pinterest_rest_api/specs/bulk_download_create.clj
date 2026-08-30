(ns pinterest-rest-api.specs.bulk-download-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-download-campaign-filter :refer :all]
            [pinterest-rest-api.specs.bulk-entity-type :refer :all]
            [pinterest-rest-api.specs.bulk-output-format :refer :all]
            )
  (:import (java.io File)))


(def bulk-download-create-data
  {
   (ds/opt :campaign_filter) bulk-download-campaign-filter-spec
   (ds/opt :entity_ids) (s/coll-of string?)
   (ds/opt :entity_types) (s/coll-of bulk-entity-type-spec)
   (ds/opt :output_format) bulk-output-format-spec
   (ds/opt :updated_since) string?
   })

(def bulk-download-create-spec
  (ds/spec
    {:name ::bulk-download-create
     :spec bulk-download-create-data}))
