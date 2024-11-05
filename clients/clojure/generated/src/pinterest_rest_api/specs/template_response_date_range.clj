(ns pinterest-rest-api.specs.template-response-date-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.template-response-date-range-dynamic-date-range :refer :all]
            [pinterest-rest-api.specs.template-response-date-range-relative-date-range :refer :all]
            [pinterest-rest-api.specs.template-response-date-range-absolute-date-range :refer :all]
            )
  (:import (java.io File)))


(def template-response-date-range-data
  {
   (ds/opt :dynamic_date_range) template-response-date-range-dynamic-date-range-spec
   (ds/opt :relative_date_range) template-response-date-range-relative-date-range-spec
   (ds/opt :absolute_date_range) template-response-date-range-absolute-date-range-spec
   })

(def template-response-date-range-spec
  (ds/spec
    {:name ::template-response-date-range
     :spec template-response-date-range-data}))
