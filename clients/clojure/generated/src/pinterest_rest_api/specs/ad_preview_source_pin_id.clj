(ns pinterest-rest-api.specs.ad-preview-source-pin-id
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-pin-preview-creative-type :refer :all]
            )
  (:import (java.io File)))


(def ad-preview-source-pin-id-data
  {
   (ds/opt :creative_type) ad-pin-preview-creative-type-spec
   (ds/req :pin_id) string?
   })

(def ad-preview-source-pin-id-spec
  (ds/spec
    {:name ::ad-preview-source-pin-id
     :spec ad-preview-source-pin-id-data}))
