(ns pinterest-rest-api.specs.trending-keywords-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.trending-keywords-response-trends-inner :refer :all]
            )
  (:import (java.io File)))


(def trending-keywords-response-data
  {
   (ds/opt :trends) (s/coll-of trending-keywords-response-trends-inner-spec)
   })

(def trending-keywords-response-spec
  (ds/spec
    {:name ::trending-keywords-response
     :spec trending-keywords-response-data}))
