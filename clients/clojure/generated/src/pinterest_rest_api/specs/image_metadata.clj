(ns pinterest-rest-api.specs.image-metadata
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.image-size :refer :all]
            )
  (:import (java.io File)))


(def image-metadata-data
  {
   (ds/opt :description) string?
   (ds/opt :images) image-size-spec
   (ds/opt :item_type) string?
   (ds/opt :link) string?
   (ds/opt :title) string?
   })

(def image-metadata-spec
  (ds/spec
    {:name ::image-metadata
     :spec image-metadata-data}))
