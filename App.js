import React from 'react';
import {StyleSheet, View} from 'react-native';
import ESRIMapView from './ESRIMapView';

export default function App() {
  return (
    <View style={styles.container}>
      <ESRIMapView
        style={{
          ...StyleSheet.absoluteFillObject,
          height: undefined,
        }}
      />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
