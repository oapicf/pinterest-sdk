(ns pinterest-rest-api.specs.ad-preview-create-from-pin
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-preview-create-from-pin-data
  {
   (ds/req :pin_id) string?
   })

(def ad-preview-create-from-pin-spec
  (ds/spec
    {:name ::ad-preview-create-from-pin
     :spec ad-preview-create-from-pin-data}))
