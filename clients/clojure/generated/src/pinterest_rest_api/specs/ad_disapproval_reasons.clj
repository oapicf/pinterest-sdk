(ns pinterest-rest-api.specs.ad-disapproval-reasons
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-disapproval-reasons-data
  {
   })

(def ad-disapproval-reasons-spec
  (ds/spec
    {:name ::ad-disapproval-reasons
     :spec ad-disapproval-reasons-data}))
