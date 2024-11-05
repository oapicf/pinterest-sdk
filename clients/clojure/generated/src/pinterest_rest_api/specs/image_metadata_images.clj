(ns pinterest-rest-api.specs.image-metadata-images
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def image-metadata-images-data
  {
   (ds/opt :150x150) image-details-spec
   (ds/opt :400x300) image-details-spec
   (ds/opt :600x) image-details-spec
   (ds/opt :1200x) image-details-spec
   })

(def image-metadata-images-spec
  (ds/spec
    {:name ::image-metadata-images
     :spec image-metadata-images-data}))
