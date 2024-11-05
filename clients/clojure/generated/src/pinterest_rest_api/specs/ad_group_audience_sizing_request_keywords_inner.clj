(ns pinterest-rest-api.specs.ad-group-audience-sizing-request-keywords-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.match-type-response :refer :all]
            )
  (:import (java.io File)))


(def ad-group-audience-sizing-request-keywords-inner-data
  {
   (ds/req :match_type) match-type-response-spec
   (ds/req :value) string?
   })

(def ad-group-audience-sizing-request-keywords-inner-spec
  (ds/spec
    {:name ::ad-group-audience-sizing-request-keywords-inner
     :spec ad-group-audience-sizing-request-keywords-inner-data}))
