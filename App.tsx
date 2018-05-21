import { Button } from 'antd-mobile'
import React from 'react'
import { StyleSheet, Text, View } from 'react-native'

export default class App extends React.Component<{}> {
  render () {
    return (
      <View style={styles.container}>
        <Button>antd-mobile button</Button>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
