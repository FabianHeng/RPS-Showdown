import * as React from "react"

const headingAccentStyles = {
    color: "#663399",
}

const pageStyles = {
    color: "#232129",
    padding: 96,
    fontFamily: "-apple-system, Roboto, sans-serif, serif",
}
const headingStyles = {
    marginTop: 0,
    marginBottom: 64,
    maxWidth: 320,
}

const Gongyi = () => {
    return(
    <main>
        <h1 style={headingStyles}>
        Congratulations
        <br />
        <span style={headingAccentStyles}>— you just made a Gatsby site! 🎉🎉🎉</span>
      </h1>
    </main>
    )
}

export default Gongyi

export const Head = () => <title>Testing</title>