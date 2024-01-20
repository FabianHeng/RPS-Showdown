
// prefer default export if available
const preferDefault = m => (m && m.default) || m


exports.components = {
  "component---cache-dev-404-page-js": preferDefault(require("/Users/fabianh/Documents/School/HNR2024/hnr2024/.cache/dev-404-page.js")),
  "component---src-pages-404-js": preferDefault(require("/Users/fabianh/Documents/School/HNR2024/hnr2024/src/pages/404.js")),
  "component---src-pages-index-js": preferDefault(require("/Users/fabianh/Documents/School/HNR2024/hnr2024/src/pages/index.js"))
}

