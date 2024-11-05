(ns pinterest-rest-api.specs.page-visit-conversion-tags-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-event-response :refer :all]
            )
  (:import (java.io File)))


(def page-visit-conversion-tags-get-200-response-data
  {
   (ds/req :items) (s/coll-of conversion-event-response-spec)
   (ds/opt :bookmark) string?
   })

(def page-visit-conversion-tags-get-200-response-spec
  (ds/spec
    {:name ::page-visit-conversion-tags-get-200-response
     :spec page-visit-conversion-tags-get-200-response-data}))
