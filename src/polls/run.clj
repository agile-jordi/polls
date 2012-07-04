(use 'ring.adapter.jetty)
(require 'polls.core)

(let [port (Integer/parseInt (get (System/getenv) "PORT" "8080"))]
  (run-jetty #'polls.core/app {:port port}))