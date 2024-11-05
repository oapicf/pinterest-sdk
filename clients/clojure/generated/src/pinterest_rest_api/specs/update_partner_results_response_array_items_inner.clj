(ns pinterest-rest-api.specs.update-partner-results-response-array-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.business-access-error :refer :all]
            )
  (:import (java.io File)))


(def update-partner-results-response-array-items-inner-data
  {
   (ds/opt :exception) business-access-error-spec
   (ds/opt :member_or_partner_id) string?
   })

(def update-partner-results-response-array-items-inner-spec
  (ds/spec
    {:name ::update-partner-results-response-array-items-inner
     :spec update-partner-results-response-array-items-inner-data}))
