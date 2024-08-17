package com.example.hazelcast.jet;

import com.hazelcast.jet.JetInstance;
import com.hazelcast.map.IMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Stream;

@Service
public class JetService {

    private final JetInstance jetInstance;

    @Autowired
    public JetService(JetInstance jetInstance) {
        this.jetInstance = jetInstance;
    }

    public void submitData(String mapName, Stream<Map.Entry<String, String>> dataStream) {
        // Get the Hazelcast map
        IMap<String, String> map = jetInstance.getMap(mapName);

        // Populate the map using the stream
        dataStream.forEach(entry -> map.put(entry.getKey(), entry.getValue()));
    }
}
