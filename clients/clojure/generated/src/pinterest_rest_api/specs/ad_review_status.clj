(ns pinterest-rest-api.specs.ad-review-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-review-status-data
  {
   })

(def ad-review-status-spec
  (ds/spec
    {:name ::ad-review-status
     :spec ad-review-status-data}))
