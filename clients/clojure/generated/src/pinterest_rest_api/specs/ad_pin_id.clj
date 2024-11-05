(ns pinterest-rest-api.specs.ad-pin-id
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-pin-id-data
  {
   (ds/opt :pin_id) string?
   })

(def ad-pin-id-spec
  (ds/spec
    {:name ::ad-pin-id
     :spec ad-pin-id-data}))
