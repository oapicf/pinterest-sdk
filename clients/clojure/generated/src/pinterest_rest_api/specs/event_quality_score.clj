(ns pinterest-rest-api.specs.event-quality-score
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ingestion-source-options :refer :all]
            [pinterest-rest-api.specs.lookback-period-options :refer :all]
            [pinterest-rest-api.specs.overall-status-options :refer :all]
            [pinterest-rest-api.specs.quality-components :refer :all]
            [pinterest-rest-api.specs.source-platform-options :refer :all]
            )
  (:import (java.io File)))


(def event-quality-score-data
  {
   (ds/req :ingestion_source) ingestion-source-options-spec
   (ds/req :lookback_period) lookback-period-options-spec
   (ds/req :overall_status) overall-status-options-spec
   (ds/req :quality_components) quality-components-spec
   (ds/req :source_platform) source-platform-options-spec
   })

(def event-quality-score-spec
  (ds/spec
    {:name ::event-quality-score
     :spec event-quality-score-data}))
