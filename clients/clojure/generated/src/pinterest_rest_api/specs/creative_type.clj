(ns pinterest-rest-api.specs.creative-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def creative-type-data
  {
   })

(def creative-type-spec
  (ds/spec
    {:name ::creative-type
     :spec creative-type-data}))
