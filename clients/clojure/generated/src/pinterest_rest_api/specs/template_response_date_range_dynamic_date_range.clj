(ns pinterest-rest-api.specs.template-response-date-range-dynamic-date-range
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def template-response-date-range-dynamic-date-range-data
  {
   (ds/opt :type) string?
   (ds/opt :range) string?
   })

(def template-response-date-range-dynamic-date-range-spec
  (ds/spec
    {:name ::template-response-date-range-dynamic-date-range
     :spec template-response-date-range-dynamic-date-range-data}))
