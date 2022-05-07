(ns pinterest-rest-api.specs.paginated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def paginated-data
  {
   (ds/req :items) (s/coll-of any?)
   (ds/opt :bookmark) string?
   })

(def paginated-spec
  (ds/spec
    {:name ::paginated
     :spec paginated-data}))
