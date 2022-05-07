(ns pinterest-rest-api.specs.ads-analytics-create-async-request-all-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.granularity :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.conversion-attribution-window-days :refer :all]
            [pinterest-rest-api.specs.conversion-report-time-type :refer :all]
            [pinterest-rest-api.specs.conversion-report-attribution-type :refer :all]
            )
  (:import (java.io File)))


(def ads-analytics-create-async-request-all-of-data
  {
   (ds/req :start_date) string?
   (ds/req :end_date) string?
   (ds/req :granularity) granularity-spec
   (ds/opt :click_window_days) conversion-attribution-window-days-spec
   (ds/opt :engagement_window_days) conversion-attribution-window-days-spec
   (ds/opt :view_window_days) conversion-attribution-window-days-spec
   (ds/opt :conversion_report_time) conversion-report-time-type-spec
   (ds/opt :attribution_types) (s/coll-of conversion-report-attribution-type-spec)
   })

(def ads-analytics-create-async-request-all-of-spec
  (ds/spec
    {:name ::ads-analytics-create-async-request-all-of
     :spec ads-analytics-create-async-request-all-of-data}))
