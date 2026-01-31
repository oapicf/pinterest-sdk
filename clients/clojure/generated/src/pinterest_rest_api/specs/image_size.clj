(ns pinterest-rest-api.specs.image-size
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.image-details :refer :all]
            [pinterest-rest-api.specs.image-details :refer :all]
            [pinterest-rest-api.specs.image-details :refer :all]
            [pinterest-rest-api.specs.image-details :refer :all]
            )
  (:import (java.io File)))


(def image-size-data
  {
   (ds/opt :1200x) image-details-spec
   (ds/opt :150x150) image-details-spec
   (ds/opt :400x300) image-details-spec
   (ds/opt :600x) image-details-spec
   })

(def image-size-spec
  (ds/spec
    {:name ::image-size
     :spec image-size-data}))
